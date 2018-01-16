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

Mobile.tap(findTestObject('ds/android.view.ViewGroup5 (2)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('ds/android.widget.EditText0 - Mobile Number (3)'), '0715645545', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('ds/android.view.ViewGroup6 (4)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('ds/android.view.ViewGroup6 (5)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('ds/android.widget.ImageView0 (6)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('ds/android.widget.ImageView0 (7)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('ds/android.widget.TextView1 (3)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('ds/android.view.ViewGroup7'), 'Pasindu', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('ds/android.view.ViewGroup9'), 'chathuranga', 0)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.startApplication('C:\\Users\\Pasindu\\Desktop\\Avonet\\drive-download-20180104T074633Z-001\\app-driver.apk', true)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('ds/android.view.ViewGroup11'), 'pasinducs@gmail.com', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('ds/android.view.ViewGroup13'), '0715545545', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('ds/android.view.ViewGroup15'), 'Aa1', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('ds/android.view.ViewGroup18'), 'Aa1', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('ds/android.view.ViewGroup21 (3)'), 0)

Mobile.tap(findTestObject('ds/android.view.ViewGroup21 (3)'), 0)

Mobile.tap(findTestObject('ds/android.view.ViewGroup8 (3)'), 0)

Mobile.tap(findTestObject('ds/android.view.ViewGroup22'), 0)

Mobile.tap(findTestObject('ds/android.view.ViewGroup13 (1)'), 0)

Mobile.tap(findTestObject('ds/android.view.ViewGroup14'), 0)

Mobile.tap(findTestObject('ds/android.widget.Button3 - OK'), 0)

