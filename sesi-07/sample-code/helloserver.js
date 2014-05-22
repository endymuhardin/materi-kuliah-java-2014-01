// Menjalankan web server dengan NodeJS

// menggunakan library http
var http = require('http');

// tiap ada request, kembalikan hello world
var server = http.createServer(function (request, response) {
  response.writeHead(200, {"Content-Type": "text/html"});
  response.end("<h1>Hello World</h1>");
});

// port server 10000
server.listen(10000);

// Kasi keterangan supaya tahu kalau sudah aktif
console.log("Silahkan browse ke http://localhost:10000/");
