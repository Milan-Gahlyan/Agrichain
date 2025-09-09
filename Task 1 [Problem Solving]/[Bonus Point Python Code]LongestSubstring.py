# The approach I took to solve this problem is the sliding window technique.
# The main idea is to avoid re-checking substrings we already know are valid. 
# Instead of looking at every single possible substring, we create a 'window' that represents our current, non-repeating substring. 
# We then try to expand this window as much as possible.

def length_of_longest_substring(s: str) -> int:
    char_index_map = {}
    
    max_length = 0
    start = 0 

    for end, char in enumerate(s):
        if char in char_index_map and char_index_map[char] >= start:
            start = char_index_map[char] + 1
        
        char_index_map[char] = end
        
        current_length = end - start + 1
        max_length = max(max_length, current_length)
        
    return max_length

if __name__ == "__main__":
    s1 = "abcabcbb"
    print(f"Input: \"{s1}\"")
    print(f"Length of longest substring: {length_of_longest_substring(s1)}") 

    s2 = "bbbbb"
    print(f"\nInput: \"{s2}\"")
    print(f"Length of longest substring: {length_of_longest_substring(s2)}") 

    s3 = "pwwkew"
    print(f"\nInput: \"{s3}\"")
    print(f"Length of longest substring: {length_of_longest_substring(s3)}") 

    s4 = ""
    print(f"\nInput: \"{s4}\"")
    print(f"Length of longest substring: {length_of_longest_substring(s4)}")