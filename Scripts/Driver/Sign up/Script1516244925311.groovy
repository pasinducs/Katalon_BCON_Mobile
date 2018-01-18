import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\Pasindu\\Desktop\\Avonet\\drive-download-20180104T074633Z-001\\app-driver.apk', true, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup4'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Driver/Sign Up/android.view.ViewGroup4 (1)'), '3', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup6'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup6 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(40, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('aaa/android.view.ViewGroup6'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('aaa/android.widget.ImageView0'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.widget.TextView1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Driver/Sign Up/android.view.ViewGroup8'), 'Pasindu', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Driver/Sign Up/android.view.ViewGroup9'), 'Chathuranga', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Driver/Sign Up/android.view.ViewGroup11'), 'pasinducs@gmail.com', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Driver/Sign Up/android.view.ViewGroup13'), '0112456456', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Driver/Sign Up/android.view.ViewGroup15'), 'Aa1', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Driver/Sign Up/android.view.ViewGroup18'), 'Aa1', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup21'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup21'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup8 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup22'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup13 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup15 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.widget.Button3 - OK'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Driver/Sign Up/android.view.ViewGroup18 (1)'), '921232195v', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup23 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Driver/Sign Up/android.widget.EditText4 - Address'), 'Kuliyapitiya', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.widget.EditText5 - Drivers licence number'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Driver/Sign Up/android.widget.EditText3 - Drivers licence number'), 'a1234567', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup23'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup23'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.widget.Button4 - OK'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup26'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.widget.ImageView0'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup29'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup8 (2)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.widget.CheckedTextView1 - Mini Car'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Driver/Sign Up/android.view.ViewGroup11 (1)'), '5', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup14'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.widget.CheckedTextView4 - Honda'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Driver/Sign Up/android.view.ViewGroup16'), 'Axio', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup19'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.widget.CheckedTextView3 - 2015'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup22 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.widget.CheckedTextView6 - Suriname'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup24'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Driver/Sign Up/android.widget.EditText1 - Registration plate number'), 'Acc1234', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup26 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup26 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.widget.Button4 - OK'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup29 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.widget.ImageView0'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup32'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup9 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.widget.ImageView0'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup12'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup7'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.widget.CheckedTextView2 - Janashakthi Insurance'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Driver/Sign Up/android.view.ViewGroup9 (2)'), 'a123', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup11 (2)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup11 (2)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.widget.Button4 - OK'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup14 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.widget.ImageView0'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup17 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.checkElement(findTestObject('Driver/Sign Up/android.view.ViewGroup3'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Sign Up/android.view.ViewGroup6 (3)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

