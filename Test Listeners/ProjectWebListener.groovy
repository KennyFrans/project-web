import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.katalon.project.web.base as Base
import com.katalon.project.web.helper as Helper

import internal.GlobalVariable as GlobalVariable

class ProjectWebListener {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	def sampleBeforeTestCase(TestCaseContext testCaseContext) {
		WebUI.openBrowser(GlobalVariable.urlFrontEnd)
		
		Base.setUp()
		
		Helper.getResolution()
		
		WebUI.click(findTestObject('front-end/home/btnCookies'))
		
		WebUI.click(findTestObject('front-end/home/btnMyAccount'))

		WebUI.click(findTestObject('front-end/home/optLogin'))

		WebUI.setText(findTestObject('front-end/login/inpEmail'), GlobalVariable.emailFrontEnd)

		WebUI.setText(findTestObject('front-end/login/inpPassword'), GlobalVariable.passwordFrontEnd)

		WebUI.click(findTestObject('front-end/login/btnLogin'))
	}

	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	def sampleAfterTestCase(TestCaseContext testCaseContext) {
		println testCaseContext.getTestCaseId()
		println testCaseContext.getTestCaseStatus()
	}
}