curl -d '{"locationId": "field-01", "rigId": "pumpjack-01", "eventDateTime": "28/11/2023 12:22:45", "source": "pumpjack", "type": "piezo", "metric": "vibrationFrequency", "value": 999.0159238981163}' \
-H "Content-Type: application/json" -X POST \
http://localhost:8082/evaluate