class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x >= 0:
            x1 = x
        else:
            x1 = -x
        my_list = []
        while (x1>0):
            a = x1%10
            my_list.append(a)
            x1 = x1/10
        size = len(my_list)
        res = 0
        sizep = size - 1
        for i in range(size):
            res = res + my_list[i]*(10**sizep)
            sizep = sizep - 1
        if res>= (-2)**31 and res <= (2)**31-1:
            if x >= 0:
                return res
            else:
                return -res
        else:
            return 0
