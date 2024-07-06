package com.github.superherocompose

import org.junit.Rule
import org.junit.Test
/**
class TopAppBarTest {
    @get: Rule
    val composeTestRule = createComposeRule()

}
class MyDialogTest {
    @get: Rule
    val composeTestRule = createComposeRule()

    @Test
    fun whenDialogIsTrue_thenShowDialog(){
        composeTestRule.setContent {
            MyDialog(show = true, {})
        }
        composeTestRule.onNodeWithTag("myDialog").assertIsDisplayed()
    }

    @Test
    fun whenDialogIsFalse_thenNotShowDialog(){
        composeTestRule.setContent {
            MyDialog(show = false, {})
        }
        composeTestRule.onNodeWithTag("myDialog").assertDoesNotExist()
    }
}*/