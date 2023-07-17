# Mobile Application Security Rules
This project is a compilation of [semgrep](https://github.com/returntocorp/semgrep) rules based on the OWASP ([MASTG](https://mas.owasp.org/MASTG/)) for mobile applications.  

semgrep is an open source static analysis tool utilized for identifying specific patterns within the target source code, without uploading it anywhere.

## Usage
```bash
cd mobile-application-security-rules
semgrep scan --config rules/ path/to/your/code
```

## Status

The rules are implemented for both native iOS (Swift) and Android (Java, Kotlin), because they represent the majority of the usages.
All OWASP MASTG rules are not covered at the moment and some cannot be implemented.

## Contributing

The contribution to this project is totally open.

### How to run tests

```bash
# globally
semgrep scan --test --config rules tests
# atomically
semgrep scan --test --config rules/path/to/rule.yml tests/path/to/rule.ext
```