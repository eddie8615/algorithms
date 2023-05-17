class Leetcode345:
    def reverseVowels(self, s: str) -> str:
        st = []
        vowels = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
        for c in s:
            if c in vowels:
                st.append(c)
        s_list = list(s)
        for i in range(len(s_list)):
            if s_list[i] in vowels:
                s_list[i] = st.pop()
        return ''.join(s_list)