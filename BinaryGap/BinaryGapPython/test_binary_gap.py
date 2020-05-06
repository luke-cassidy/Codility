import unittest
import binary_gap as bg


class BinaryGapTestCase(unittest.TestCase):

    def test_with_one_char(self):
        num = int("0", 2)
        exp = 0
        act = bg.solution(num)
        self.assertEquals(exp, act)

        num = int("1", 2)
        act = bg.solution(num)
        self.assertEquals(exp, act)

    def test_with_only_0s(self):
        num = int("000", 2)
        exp = 0
        act = bg.solution(num)
        self.assertEquals(exp, act)

    def test_with_only_1s(self):
        num = int("111", 2)
        exp = 0
        act = bg.solution(num)
        self.assertEquals(exp, act)

    def test_with_0s_at_start(self):
        num = int("0011", 2)
        exp = 0
        act = bg.solution(num)
        self.assertEquals(exp, act)

    def test_with_0s_at_end(self):
        num = int("1100", 2)
        exp = 0
        act = bg.solution(num)
        self.assertEquals(exp, act)

    def test_with_single_binary_gap_of_one_0(self):
        num = int("101", 2)
        exp = 1
        act = bg.solution(num)
        self.assertEquals(exp, act)

    def test_with_single_binary_gap_of_multipe_0s(self):
        num = int("10001", 2)
        exp = 3
        act = bg.solution(num)
        self.assertEquals(exp, act)

    def test_with_multiple_binary_gaps_where_second_is_longest(self):
        num = int("01010011", 2)
        exp = 2
        act = bg.solution(num)
        self.assertEquals(exp, act)

    def test_with_multiple_binary_gaps_where_first_is_longest(self):
        num = int("10010110", 2)
        exp = 2
        act = bg.solution(num)
        self.assertEquals(exp, act)


if __name__ == '__main__':
    unittest.main()
