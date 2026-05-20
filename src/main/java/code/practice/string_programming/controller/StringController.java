package code.practice.string_programming.controller;

import code.practice.string_programming.service.StringService;
import code.practice.string_programming.service.SubStringService;
import code.practice.string_programming.util.ScannerUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/string-programming")
public class StringController {

    @Autowired
    private StringService stringService;
    @Autowired
    private SubStringService subStringService;

    @GetMapping("/reverse")
    public void reversal(){
        stringService.stringReverse(ScannerUtility.inputString());
    }

    @GetMapping("/vowel-count")
    public void vowelCount(){
        stringService.stringVowel(ScannerUtility.inputString());
    }

    @GetMapping("/duplicate-char-removal")
    public void duplicationRemoval(){
        stringService.stringDuplicateCharRemoval(ScannerUtility.inputString());
    }

    @GetMapping("/char-frequency")
    public void charFrequency(){
        stringService.charFrequencyString(ScannerUtility.inputString());
    }

    @GetMapping("/anagram-check")
    public void anagramCheck(){
        stringService.anagramString(ScannerUtility.inputString(), ScannerUtility.inputString());
    }

    @GetMapping("/string-palindrome")
    public void palindromeString(){
        stringService.stringPalindrome(ScannerUtility.inputString());
    }

    @GetMapping("/dynamic-sub-string")
    public void dynamicSubString(){
        subStringService.dynamicLengthSubString(ScannerUtility.inputString());
    }

    @GetMapping("/fixed-sub-string")
    public void fixedSubString(){
        subStringService.fixedLengthSubString(ScannerUtility.inputString(), ScannerUtility.inputInteger());
    }

    @GetMapping("/largest-sub-string")
    public void largestSubString(){
        subStringService.largestSubString(ScannerUtility.inputString());
    }

    @GetMapping("/smallest-sub-string")
    public void smallestSubString(){
        subStringService.smallestSubString(ScannerUtility.inputString());
    }


}
