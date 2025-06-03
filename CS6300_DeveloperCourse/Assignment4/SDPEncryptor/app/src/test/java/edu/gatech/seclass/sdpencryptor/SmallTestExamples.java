package edu.gatech.seclass.sdpencryptor;

import static org.junit.Assert.fail;

import android.view.View;
import android.widget.TextView;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

/**
 * This is a Georgia Tech provided code example for use in assigned private GT
 * repositories. Students and other users of this template code are advised not
 * to share it with other students or to make it available on publicly viewable
 * websites including repositories such as github and gitlab.  Such sharing may
 * be investigated as a GT honor code violation. Created for CS6300.
 */

@RunWith(RobolectricTestRunner.class)
public class SmallTestExamples {

    private MainActivity activity;
    private RobolectricViewAssertions rva = new RobolectricViewAssertions();

    @Before
    public void setUp() {
        activity = Robolectric.buildActivity(MainActivity.class).create().get();
        rva.setActivity(activity);
    }

    @Test(timeout = 500)
    public void testBasicEncryption1() {
        rva.replaceText(R.id.messageTextID, "Cat & Dog");
        rva.replaceText(R.id.scaleInputID, "5");
        rva.replaceText(R.id.shiftInputID, "3");
        rva.clickWithTimeoutAndDefaultMessage(R.id.encodeButtonID);

        rva.assertTextViewText(R.id.encodedTextID, "7Ro & cZl");
    }

    @Test(timeout = 500)
    public void testBasicEncryption2() {
        rva.replaceText(R.id.messageTextID, "Up with the White And Gold!");
        rva.replaceText(R.id.scaleInputID, "1");
        rva.replaceText(R.id.shiftInputID, "1");
        rva.clickWithTimeoutAndDefaultMessage(R.id.encodeButtonID);

        rva.assertTextViewText(R.id.encodedTextID, "Vq xjui uif Xijuf Boe Hpme!");
    }

    @Test(timeout = 500)
    public void testBasicEncryption3() {
        rva.replaceText(R.id.messageTextID, "abcdefg");
        rva.replaceText(R.id.scaleInputID, "5");
        rva.replaceText(R.id.shiftInputID, "1");
        rva.clickWithTimeoutAndDefaultMessage(R.id.encodeButtonID);

        rva.assertTextViewText(R.id.encodedTextID, "PUZ49ej");
    }

    @Test(timeout = 500)
    public void testBasicEncryption4() {
        rva.replaceText(R.id.messageTextID, "Panda Cat");
        rva.replaceText(R.id.scaleInputID, "23");
        rva.replaceText(R.id.shiftInputID, "1");
        rva.clickWithTimeoutAndDefaultMessage(R.id.encodeButtonID);
        rva.assertTextViewText(R.id.encodedTextID, "WJyQJ 7JM");
    }

    @Test(timeout = 500)
    public void testEncryptionWithSpecialCharacterPrefixSuffix() {
        rva.replaceText(R.id.messageTextID, "__trigger__");
        rva.replaceText(R.id.scaleInputID, "5");
        rva.replaceText(R.id.shiftInputID, "1");
        rva.clickWithTimeoutAndDefaultMessage(R.id.encodeButtonID);

        rva.assertTextViewText(R.id.encodedTextID, "__mctjj9c__");
    }

    @Test(timeout = 500)
    public void errorTest1() {
        rva.replaceText(R.id.messageTextID, "");
        rva.replaceText(R.id.scaleInputID, "0");
        rva.replaceText(R.id.shiftInputID, "0");
        rva.clickWithTimeoutAndDefaultMessage(R.id.encodeButtonID);

        rva.assertTextViewError(R.id.messageTextID, "Invalid Message Text");
        rva.assertTextViewError(R.id.scaleInputID, "Invalid Scale Input");
        rva.assertTextViewError(R.id.shiftInputID, "Invalid Shift Input");
        rva.assertTextViewText(R.id.encodedTextID, "");
    }
}
