# coding=utf-8

from selenium import webdriver
import time

class Testclass (object):
	def dengLu(self):
		browser=webdriver.firefox()
		browser.get("http://www.baidu.com")
		time.sleep(2)
		browser.find_element_by_id("kw").send_key("√À¥Û")
		browser.find_element_by_id("su").click()
		time.sleep(2)
		browser.quit()
		
p = Testclass()
p.dengLu()

