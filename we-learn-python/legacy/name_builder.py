import re
import string


class NameBuilder(object):
    def __init__(self):  # constructor
        # field without specific class field definition
        self.replacements = {"ä": "ae",
                             "ü": "ue",
                             "ö": "oe",
                             "Ä": "Ae",
                             ",": "COMMA",
                             ";": "SEMICOLON"}  # build-in type python dictionary like map in Java
        self.white_space_pattern = re.compile(" {2,}")  # regex

    # function(self_for_object_access, string, default_optional_string) with return string
    def fix_special_characters(self, name: string, prefix: string = 'itemis_') -> string:
        self.check_name(name)
        name_without_white_spaces = self.handle_white_spaces(name)
        name_with_replacements = self.use_replacements(name_without_white_spaces)
        name_with_underscore_suffix = self.add_underscore_suffix(name_with_replacements)
        return prefix + name_with_underscore_suffix

    @staticmethod
    def check_name(name):
        # if statement with 'None' object with NoneType, indicates no value (instead of null - java)
        # (see StackOverflow: what-is-a-nonetype-object)
        if name is None:
            raise Exception('Input name is a NoneType!')  # like throw exception in java

    def handle_white_spaces(self, name):
        name_strip = name.strip()
        name_with_single_whitespace = self.white_space_pattern.sub(' ', name_strip)  # replace matching regex pattern
        name_split_by_white_spaces: list = name_with_single_whitespace.split(' ')
        modified_name = name_split_by_white_spaces[0] + ''.join(
            map(lambda name_part: self.set_first_letter_uppercase(name_part),
                name_split_by_white_spaces[1:]))  # map with lambda
        return modified_name

    @staticmethod
    def set_first_letter_uppercase(name_part: string):  # function without return type definition
        name_part_characters: list = list(name_part)
        return name_part_characters[0].upper() + ''.join(name_part_characters[1:])
        # use [x:y] to get values from list by position - when position not existing emptyList will be returned

    def use_replacements(self, stripped_name):  # parameter without types
        for key, value in self.replacements.items():  # for loop over dictionary field
            stripped_name = stripped_name.replace(key, value)
        return stripped_name

    @staticmethod
    def add_underscore_suffix(stripped_name):
        if stripped_name.__contains__('_'):  # if-else statement
            stripped_name = f'{stripped_name}-UNDERSCORED'  # f-string like template-string in java
        else:
            stripped_name = f'{stripped_name}-NOT_UNDERSCORED'
        return stripped_name

# no semicolons
# no curly braces
# no specific field declaration required -  see __init__(...)
# access instance attributes with self
