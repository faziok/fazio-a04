package exercise43.baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution43Test {
    Solution43 app = new Solution43();

    //Only testing yes or no verification as the output methods are void methods.

    @Test
    void checkYesOrNo() {
        String answerY = "Y";
        String answerYes = "Yes";
        String answerN = "N";
        String answerNo = "No";

        assertTrue(app.checkYesOrNo(answerY));
        assertTrue(app.checkYesOrNo(answerYes));
        assertFalse(app.checkYesOrNo(answerN));
        assertFalse(app.checkYesOrNo(answerNo));
    }
}