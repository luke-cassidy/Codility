import unittest
import count_div as cd


class CountDivTestCase(unittest.TestCase):

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def test_when_A_and_B_are_equal(self):
        A = 0
        B = 0
        K = 1
        exp = 1
        act = cd.solution(A, B, K)
        self.assertEqual(exp, act)

        A = 1
        B = 1
        K = 1
        exp = 1
        act = cd.solution(A, B, K)
        self.assertEqual(exp, act)

        A = 1
        B = 1
        K = 2
        exp = 0
        act = cd.solution(A, B, K)
        self.assertEqual(exp, act)

        A = 2
        B = 2
        K = 2
        exp = 1
        act = cd.solution(A, B, K)
        self.assertEqual(exp, act)

    def test_when_A_is_less_than_B_and_K_is_1(self):
        A = 0
        B = 1
        K = 1
        exp = 2
        act = cd.solution(A, B, K)
        self.assertEqual(exp, act)

        A = 0
        B = 2
        K = 1
        exp = 3
        act = cd.solution(A, B, K)
        self.assertEqual(exp, act)

        A = 1
        B = 10
        K = 1
        exp = 10
        act = cd.solution(A, B, K)
        self.assertEqual(exp, act)

        A = 5
        B = 10
        K = 1
        exp = 6
        act = cd.solution(A, B, K)
        self.assertEqual(exp, act)

    def test_when_A_is_less_than_B_and_K_is_2(self):
        A = 0
        B = 1
        K = 2
        exp = 1
        act = cd.solution(A, B, K)
        self.assertEqual(exp, act)

        A = 0
        B = 2
        K = 2
        exp = 2
        act = cd.solution(A, B, K)
        self.assertEqual(exp, act)

        A = 1
        B = 10
        K = 2
        exp = 5
        act = cd.solution(A, B, K)
        self.assertEqual(exp, act)

        A = 5
        B = 10
        K = 2
        exp = 3
        act = cd.solution(A, B, K)
        self.assertEqual(exp, act)

    def test_when_A_is_less_than_B_and_K_is_greater_than_2(self):
        A = 0
        B = 1
        K = 3
        exp = 1
        act = cd.solution(A, B, K)
        self.assertEqual(exp, act)

        A = 0
        B = 2
        K = 5
        exp = 1
        act = cd.solution(A, B, K)
        self.assertEqual(exp, act)

        A = 0
        B = 10
        K = 5
        exp = 3
        act = cd.solution(A, B, K)
        self.assertEqual(exp, act)

        A = 5
        B = 20
        K = 3
        exp = 5
        act = cd.solution(A, B, K)
        self.assertEqual(exp, act)

    def test_with_big_numbers(self):
        A = 2000000000
        B = 2000000000
        K = 1
        exp = 1
        act = cd.solution(A, B, K)
        self.assertEqual(exp, act)

        A = 0
        B = 2000000000
        K = 2000000000
        exp = 2
        act = cd.solution(A, B, K)
        self.assertEqual(exp, act)

        A = 0
        B = 2000000000
        K = 1
        exp = 2000000001
        act = cd.solution(A, B, K)
        self.assertEqual(exp, act)

        A = 0
        B = 2000000000
        K = 3
        exp = 666666667
        act = cd.solution(A, B, K)
        self.assertEqual(exp, act)

        A = 1
        B = 2000000000
        K = 3
        exp = 666666666
        act = cd.solution(A, B, K)
        self.assertEqual(exp, act)

        A = 1
        B = 2000000000
        K = 1000000000
        exp = 2
        act = cd.solution(A, B, K)
        self.assertEqual(exp, act)


if __name__ == '__main__':
    unittest.main()
