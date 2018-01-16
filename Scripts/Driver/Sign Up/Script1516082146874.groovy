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

Mobile.tap(findTestObject('ds/android.view.ViewGroup4'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('ds/android.widget.EditText0 - Mobile Number'), '0715645545', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('ds/android.view.ViewGroup6'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('ds/android.view.ViewGroup6'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('ds/android.widget.ImageView0'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('ds/android.widget.ImageView0 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('ds/android.widget.TextView1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('ds/android.view.ViewGroup7'), 'Pasindu', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('ds/android.view.ViewGroup9'), 'chathuranga', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('ds/android.view.ViewGroup11'), 'pasinducs@gmail.com', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('ds/android.view.ViewGroup13'), '0715545545', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('ds/android.view.ViewGroup15'), 'Aa1', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('ds/android.view.ViewGroup18'), 'Aa1', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('ds/android.view.ViewGroup21'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('ds/android.view.ViewGroup21'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ds/android.view.ViewGroup8'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.view.ViewGroup22'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.startApplication('C:\\Users\\Pasindu\\Desktop\\Avonet\\drive-download-20180104T074633Z-001\\app-driver.apk', true)

Mobile.tap(findTestObject('ds/android.view.ViewGroup5 (3)'), 0)

Mobile.tap(findTestObject('ds/android.view.ViewGroup22 (1)'), 0)

Mobile.closeApplication()

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.view.ViewGroup13 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.view.ViewGroup15 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.Button3 - OK'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Driver Sign Up/android.view.ViewGroup17 (1)'), '921232195v', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Driver Sign Up/android.widget.EditText3 - Address'), 'kuliyapitiya', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Driver Sign Up/android.widget.EditText3 - Drivers licence number'), 'A1234567', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.EditText6 - January 16th 2018'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.EditText6 - January 16th 2018'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.Button2 - 2019'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.Button7 - OK'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.EditText7 - Drivers licence image'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.ImageView5'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.view.ViewGroup29'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.Spinner0'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.CheckedTextView1 - Mini Car'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Driver Sign Up/android.widget.EditText0 - 1'), '5', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.Spinner1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.CheckedTextView3 - Nissan'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Driver Sign Up/android.widget.EditText1 - Model'), 'Axio', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.Spinner2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.CheckedTextView4 - 2014'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.Spinner3'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.CheckedTextView3 - St Vincent'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.EditText2 - Registration plate number'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Driver Sign Up/android.widget.EditText1 - Registration plate number'), 'AAA 4534', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.EditText3 - Licences expiry date'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.EditText3 - Licences expiry date'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.Button4 - OK'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.EditText4 - Licence image'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.ImageView10'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.view.ViewGroup32'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.view.ViewGroup9 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.ImageView10'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.view.ViewGroup12'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.Spinner0 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.CheckedTextView2 - Janashakthi Insurance'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Driver Sign Up/android.view.ViewGroup10'), 'A123123', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.view.ViewGroup12 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.EditText1 - Expiry Date'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.Button4 - OK'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.EditText2 - Insurance Image'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.widget.ImageView0 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.view.ViewGroup17 (2)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.checkElement(findTestObject('Driver Sign Up/android.view.ViewGroup5'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Driver Sign Up/android.view.ViewGroup6 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

