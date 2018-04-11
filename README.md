When a Spring WebSocket handler path matches a RequestMapping, WS connection is not established.

Steps to reproduce:
1. open localhost:8080/index.html
2. inspect console
3. expected output:
```
http GET response: REST endpoint
WS connection open
```
3. actual output (in Chrome)
```
http GET response: REST endpoint
(index):16 WebSocket connection to 'ws://localhost:8080/app' failed: Error during WebSocket handshake: Unexpected response code: 200
```