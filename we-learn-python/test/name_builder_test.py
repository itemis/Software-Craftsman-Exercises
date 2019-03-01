import unittest
from legacy import *


class NameBuilderTest(unittest.TestCase):  # inheritance with unittest.TestCase as base class

    def setUp(self):  # test runner runs this setUp function before each test
        self.name_builder = NameBuilder()

    def test_fix_special_characters_invalid_input(self):  # test function have to start with test prefix
        with self.assertRaises(Exception) as context:
            self.name_builder.fix_special_characters(None)
        self.assertEqual('Input name is a NoneType!', str(context.exception))  # handle context.exception as string

    def test_fix_special_characters_with_empty_input(self):
        fixed_special_characters = self.name_builder.fix_special_characters("")
        self.assertEqual(fixed_special_characters, "itemis_-NOT_UNDERSCORED")
