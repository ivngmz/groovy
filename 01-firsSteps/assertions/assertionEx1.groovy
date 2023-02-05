package assertions



class TranslationService {
    String convert(String key) {
        return "test"
    }
}

def service = [convert: { String key -> 'some text' }] as TranslationService
assert 'some text' == service.convert('key.text')



