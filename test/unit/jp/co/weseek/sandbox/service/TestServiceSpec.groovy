package jp.co.weseek.sandbox.service

import grails.plugin.spock.UnitSpec

class TestServiceSpec extends UnitSpec {
	
	def "test testMethod"() {
		when:
		def result = service.testMethod()
		
		then:
		result == true
	}
}
