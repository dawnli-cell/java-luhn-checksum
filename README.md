# Luhn checksum validate/generate

Computing Luhn check digits for primary account numbers necessitates strict deterministic execution to preserve audit trails, which this implementation achieves without external dependencies. I prefer Go for ledger services. This Java Luhn Checksum restricts execution to the standard library to prevent non-deterministic behavior during reconciliation.

```
Luhn.java
```
Executing the colocated test suite provides verifiable proof of correctness and ensures compliance with exactly-once processing limits.