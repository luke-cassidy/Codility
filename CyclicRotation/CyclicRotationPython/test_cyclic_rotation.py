import unittest
import cyclic_rotation as cr


class CyclicRotationTestCase(unittest.TestCase):

    def setUp(self):
        pass

    def test_array_length_is_0(self):
        array, exp = [], []
        act = cr.solution(array, -2)
        self.assertEquals(exp, act)
        act = cr.solution(array, -1)
        self.assertEquals(exp, act)
        act = cr.solution(array, 0)
        self.assertEquals(exp, act)
        act = cr.solution(array, 1)
        self.assertEquals(exp, act)
        act = cr.solution(array, 2)
        self.assertEquals(exp, act)

    def test_array_length_is_1(self):
        array, exp = [1], [1]
        act = cr.solution(array, -2)
        self.assertEquals(exp, act)
        act = cr.solution(array, -1)
        self.assertEquals(exp, act)
        act = cr.solution(array, 0)
        self.assertEquals(exp, act)
        act = cr.solution(array, 1)
        self.assertEquals(exp, act)
        act = cr.solution(array, 2)
        self.assertEquals(exp, act)

    def test_array_length_is_2(self):
        array = [1, 2]
        exp = [1, 2]
        act = cr.solution(array, -2)
        self.assertEquals(exp, act)
        exp = [2, 1]
        act = cr.solution(array, -1)
        self.assertEquals(exp, act)
        exp = [1, 2]
        act = cr.solution(array, 0)
        self.assertEquals(exp, act)
        exp = [2, 1]
        act = cr.solution(array, 1)
        self.assertEquals(exp, act)
        exp = [1, 2]
        act = cr.solution(array, 2)
        self.assertEquals(exp, act)

    def test_array_length_is_3(self):
        array = [1, 2, 3]
        exp = [3, 1, 2]
        act = cr.solution(array, -2)
        self.assertEquals(exp, act)
        exp = [2, 3, 1]
        act = cr.solution(array, -1)
        self.assertEquals(exp, act)
        exp = [1, 2, 3]
        act = cr.solution(array, 0)
        self.assertEquals(exp, act)
        exp = [3, 1, 2]
        act = cr.solution(array, 1)
        self.assertEquals(exp, act)
        exp = [2, 3, 1]
        act = cr.solution(array, 2)
        self.assertEquals(exp, act)

    def test_where_K_is_greater_than_len_array(self):
        array = []
        exp = []
        act = cr.solution(array, -1)
        self.assertEquals(exp, act)
        act = cr.solution(array, 1)
        self.assertEquals(exp, act)

        array = [1]
        exp = [1]
        act = cr.solution(array, -2)
        self.assertEquals(exp, act)
        act = cr.solution(array, 2)
        self.assertEquals(exp, act)

        array = [1, 2, 3]
        exp = [1, 2, 3]
        act = cr.solution(array, -6)
        self.assertEquals(exp, act)
        act = cr.solution(array, 6)
        self.assertEquals(exp, act)
        exp = [3, 1, 2]
        act = cr.solution(array, -8)
        self.assertEquals(exp, act)
        exp = [2, 3, 1]
        act = cr.solution(array, 8)
        self.assertEquals(exp, act)


if __name__ == '__main__':
    unittest.main()
