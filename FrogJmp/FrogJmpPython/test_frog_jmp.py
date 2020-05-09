import unittest
import frog_jmp as fj


class FrogJmpTestCase(unittest.TestCase):

    def setUp(self):
        pass

    def test_where_X_Y_are_equal(self):
        exp = 0
        act = fj.solution(1, 1, 1)
        self.assertEquals(exp, act)

        exp = 0
        act = fj.solution(2, 2, 1)
        self.assertEquals(exp, act)

        exp = 0
        act = fj.solution(3, 3, 6)
        self.assertEquals(exp, act)

    def test_where_Y_is_greater_than_X_and_D_is_a_factor_of_Y_minus_X(self):
        exp = 1
        act = fj.solution(1, 2, 1)
        self.assertEquals(exp, act)

        exp = 1
        act = fj.solution(2, 4, 2)
        self.assertEquals(exp, act)

        exp = 2
        act = fj.solution(3, 9, 3)
        self.assertEquals(exp, act)

        exp = 1
        act = fj.solution(1, 3, 2)
        self.assertEquals(exp, act)

    def test_where_Y_is_greater_than_X_and_D_is_not_a_factor_of_Y_minus_X(self):
        exp = 3
        act = fj.solution(2, 9, 3)
        self.assertEquals(exp, act)

        exp = 1
        act = fj.solution(3, 16, 14)
        self.assertEquals(exp, act)

    def test_where_Y_is_greater_than_X_and_D_is_a_multipe_of_Y_minus_X(self):
        exp = 1
        act = fj.solution(2, 4, 4)
        self.assertEquals(exp, act)

        exp = 1
        act = fj.solution(3, 9, 12)
        self.assertEquals(exp, act)

    def test_where_Y_is_greater_than_X_and_D_is_not_a_multipe_of_Y_minus_X(self):
        exp = 1
        act = fj.solution(2, 4, 5)
        self.assertEquals(exp, act)

        exp = 1
        act = fj.solution(3, 9, 13)
        self.assertEquals(exp, act)

    def test_big_numbers(self):
        exp = 0
        act = fj.solution(1000000000, 1000000000, 1)
        self.assertEquals(exp, act)

        exp = 1
        act = fj.solution(1, 10, 1000000000)
        self.assertEquals(exp, act)

        exp = 999999999
        act = fj.solution(1, 1000000000, 1)
        self.assertEquals(exp, act)


if __name__ == '__main__':
    unittest.main()
