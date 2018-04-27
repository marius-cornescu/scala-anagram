import org.scalatest.FlatSpec

class AnagramTest extends FlatSpec {

    "Anagram" should "return yes if one letter words are equals" in {
        var letter1 = "a"
        var letter2 = "a"
        var anagram = new Anagram(letter1, letter2)
        assert(anagram.isAnagram)
    }

    "Anagram" should "return no if one letter words are not equals" in {
        var letter1 = "a"
        var letter2 = "b"
        var anagram = new Anagram(letter1, letter2)
        assert(!anagram.isAnagram)
    }

    "Anagram" should "return yes if two letter words are equals" in {
        var letter1 = "aa"
        var letter2 = "aa"
        var anagram = new Anagram(letter1, letter2)
        assert(anagram.isAnagram)
    }

    "Anagram" should "return no if two words have different size" in {
        var letter1 = "abC"
        var letter2 = "ba"
        var anagram = new Anagram(letter1, letter2)
        assert(!anagram.isAnagram)
    }

    "Anagram" should "return yes if two letter words are anagram" in {
        var letter1 = "ab"
        var letter2 = "ba"
        var anagram = new Anagram(letter1, letter2)
        assert(anagram.isAnagram)
    }

    "Anagram" should "return yes if many letter words are anagram" in {
        var letter1 = "geeksforgeeks"
        var letter2 = "forgeeksgeeks"
        var anagram = new Anagram(letter1, letter2)
        assert(anagram.isAnagram)
    }

}
