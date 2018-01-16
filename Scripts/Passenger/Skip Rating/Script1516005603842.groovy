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

Mobile.startApplication('C:\\Users\\Pasindu\\Desktop\\Avonet\\drive-download-20180104T074633Z-001\\app-passenger.apk', true)

Mobile.tap(findTestObject('Passenger/TripRequest/android.view.ViewGroup7'), 0)

Mobile.setText(findTestObject('Passenger/TripRequest/android.widget.EditText0 - Mobile Number'), '0715645545', 0)

Mobile.setText(findTestObject('Passenger/TripRequest/android.widget.EditText1'), 'password123', 0)

Mobile.tap(findTestObject('Passenger/TripRequest/android.view.ViewGroup9'), 0)

Mobile.tap(findTestObject('Passenger/TripRequest/android.view.ViewGroup9 (1)'), 0)

Mobile.setText(findTestObject('Passenger/TripRequest/android.view.ViewGroup10'), 'colombo', 0)

Mobile.tap(findTestObject('Passenger/TripRequest/android.view.ViewGroup13'), 0)

Mobile.tap(findTestObject('Passenger/TripRequest/android.view.ViewGroup18'), 0)

Mobile.tap(findTestObject('Passenger/TripRequest/android.view.ViewGroup18 (1)'), 0)

Mobile.tap(findTestObject('Passenger/TripRequest/android.view.ViewGroup4'), 0)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Passenger/Skip Rating/android.view.ViewGroup26'), 0)

