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

Mobile.startApplication('C:\\Users\\Pasindu\\Desktop\\Avonet\\drive-download-20180104T074633Z-001\\app-driver.apk', true)

Mobile.tap(findTestObject('Driver/Support/android.view.ViewGroup6'), 0)

Mobile.setText(findTestObject('Driver/Support/android.view.ViewGroup4'), '0766500626', 0)

Mobile.setText(findTestObject('Driver/Support/android.view.ViewGroup6 (1)'), 'Dilan6370', 0)

Mobile.tap(findTestObject('Driver/Support/android.view.ViewGroup9'), 0)

Mobile.tap(findTestObject('Driver/Support/android.view.ViewGroup9 (1)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Driver/Support/android.view.ViewGroup5'), 0)

Mobile.tap(findTestObject('Driver/Support/android.view.ViewGroup23'), 0)

Mobile.setText(findTestObject('Driver/Support/android.view.ViewGroup11'), 'Hello', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Driver/Support/android.view.ViewGroup13'), 'Good passenger', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Driver/Support/android.view.ViewGroup15'), 0)

Mobile.tap(findTestObject('Driver/Support/android.view.ViewGroup15'), 0)

Mobile.checkElement(findTestObject('Driver/Support/android.view.ViewGroup5 (1)'), 0)

Mobile.tap(findTestObject('Driver/Support/android.view.ViewGroup3'), 0)

