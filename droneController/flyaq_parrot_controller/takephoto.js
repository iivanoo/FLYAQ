var fs = require('fs');
var arDrone = require('../ardrone-autonomy-master/node_modules/ar-drone');
var client  = arDrone.createClient();
client.interval=10;

var out=fs.createWriteStream('text.png');

//var png = client.getPngStream({expectFIN: TRUE});
var png = client.getPngStream({expectFIN: 'TRUE'});
var png = client.getPngStream({t:5});
png.on('data', function(chunk){
  out.write(chunk);
  
});
png.on('end', function(){
  console.log('saved png');
});
client.config({ key: 'general:vision_enable', value: 'FALSE', timeout: 1000 });
console.log('DARKO');

