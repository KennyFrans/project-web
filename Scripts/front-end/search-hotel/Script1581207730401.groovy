import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.katalon.project.web.helper as Helper

WebUI.click(findTestObject('front-end/account/btnHome'))

WebUI.delay(1)

Helper.selectHotelDestination("Alzer Hotel Istanbul", "Hotels")

WebUI.scrollToPosition(0, 150)