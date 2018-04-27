
class Anagram (word1:String, word2:String) {

    def isAnagram: Boolean = {
        if(word1 == word2){
            true
        } else if(word1.length != word2.length) {
            false
        } else {
            val list1 = word1.toList.sorted
            val list2 = word2.toList.sorted

            checkAnagram(list1, list2)
        }
    }

    def checkAnagram(word1Chars:List[Char], word2Chars:List[Char]): Boolean = {
        word1Chars.equals(word2Chars)
    }
}
