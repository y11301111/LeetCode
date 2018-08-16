class Solution:
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        if prices == [] or len(prices)==1:
            return 0
        else:
            minValue=prices[0]
            maxV=0
            for value in prices:
                if value-minValue > maxV:
                    maxV = value-minValue
                if value < minValue:
                    minValue = value
            return maxV
            