import geb.spock.GebSpec

class IndexSpec extends GebSpec {
    void "store path should be redirected to the image url"() {
        when:
        go ''

        then:
        assert title == 'Gaelyk Template Project'
        assert $("h1").text() == "About Gaelyk"
    }
}
