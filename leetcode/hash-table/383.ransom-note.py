#
# @lc app=leetcode id=383 lang=python3
#
# [383] Ransom Note
#

# @lc code=start
class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        if(len(ransomNote) > len(magazine)):
            return False
        
        countMap = {}
        counter = 0
        for i in range(len(magazine)):
            countMap[magazine[i]] = countMap.get(magazine[i], 0) + 1
            
        for i in range(len(ransomNote)):
            countMap[ransomNote[i]] = countMap.get(ransomNote[i], 0) - 1
            if(countMap.get(ransomNote[i]) < 0):
                counter += 1
                
            # if(counter > 0):
            #     return False
            
            
        return counter == 0

# @lc code=end

s = Solution()
r = s.canConstruct("aaabbbs", "ashniaushiuasaaabbbsss")
# r = s.canConstruct("a", "b")
print(r)


# Accepted
# 127/127 cases passed (90 ms)
# Your runtime beats 67.81 % of python3 submissions
# Your memory usage beats 19.97 % of python3 submissions (14.2 MB)

# class Solution:
#     def canConstruct(self, ransomNote: str, magazine: str) -> bool:
#         if(len(ransomNote) > len(magazine)):
#             return False
        
#         for r in ransomNote:
#             if r not in magazine: return False
#             magazine = magazine.replace(r, '', 1)
            
#         return True