# Trigeering Methods in Spring Boot via JMX Jolokia

This is a simple Java Spring Boot project demonstrating trigeering methods in spring boot via JMX Jolokia.

### Trigger Method cURL
```
curl --location 'http://localhost:8080/actuator/jolokia' \
--header 'Content-Type: application/json' \
--data '{
    "type": "exec",
    "mbean": "dev.parth.jmx_app:name=Testing",
    "operation": "jmxTest",
    "arguments": [
        "Manvi"
    ]
}'
```
### Response
```
{
    "request": {
        "mbean": "dev.parth.jmx_app:name=Testing",
        "arguments": [
            "Manvi"
        ],
        "type": "exec",
        "operation": "jmxTest"
    },
    "value": "hello Manvi",
    "status": 200,
    "timestamp": 1752084550
}
```
