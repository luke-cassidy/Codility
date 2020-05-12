import unittest
import frog_river_one as fro
import random


class FrogRiverOneTestCase(unittest.TestCase):

    def setUp(self):
        pass

    def test_when_len_A_is_1(self):
        X = 1
        A = [1]
        exp = 0
        act = fro.solution(X, A)
        self.assertEqual(exp, act)

        X = 2
        A = [1]
        exp = -1
        act = fro.solution(X, A)
        self.assertEqual(exp, act)

        X = 1
        A = [2]
        exp = -1
        act = fro.solution(X, A)
        self.assertEqual(exp, act)

    def test_when_len_A_is_2(self):
        X = 2
        A = [1, 2]
        exp = 1
        act = fro.solution(X, A)
        self.assertEqual(exp, act)

        X = 2
        A = [2, 1]
        exp = 1
        act = fro.solution(X, A)
        self.assertEqual(exp, act)

        X = 3
        A = [1, 2]
        exp = -1
        act = fro.solution(X, A)
        self.assertEqual(exp, act)

        X = 3
        A = [1, 3]
        exp = -1
        act = fro.solution(X, A)
        self.assertEqual(exp, act)

    def test_when_len_A_is_3(self):
        X = 3
        A = [1, 2, 3]
        exp = 2
        act = fro.solution(X, A)
        self.assertEqual(exp, act)

        X = 3
        A = [3, 2, 1]
        exp = 2
        act = fro.solution(X, A)
        self.assertEqual(exp, act)

        X = 2
        A = [1, 2, 1]
        exp = 1
        act = fro.solution(X, A)
        self.assertEqual(exp, act)

        X = 2
        A = [2, 2, 1]
        exp = 2
        act = fro.solution(X, A)
        self.assertEqual(exp, act)

        X = 3
        A = [1, 2, 2]
        exp = -1
        act = fro.solution(X, A)
        self.assertEqual(exp, act)

        X = 3
        A = [1, 2, 4]
        exp = -1
        act = fro.solution(X, A)
        self.assertEqual(exp, act)

    def test_when_len_A_is_large(self):
        X = 100000
        A = []
        for i in range(X):
            A.append(i + 1)
        exp = X - 1
        act = fro.solution(X, A)
        self.assertEqual(exp, act)

        X = 100000
        A = []
        for i in range(X, 0, -1):
            A.append(i)
        exp = X - 1
        act = fro.solution(X, A)
        self.assertEqual(exp, act)

        X = 25000
        A = []
        for i in range(X, 0, -1):
            A.append(i)
            A.append(i)
            A.append(random.randrange(X, i-1, -1))
        exp = (X - 1) * 3
        act = fro.solution(X, A)
        self.assertEqual(exp, act)


if __name__ == '__main__':
    unittest.main()
