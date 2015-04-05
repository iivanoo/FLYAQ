var df = require('dateformat')
  , autonomy = require('../')
  , mission  = autonomy.createMission()
  ;

// Land on ctrl-c
var exiting = false;
process.on('SIGINT', function() {
    if (exiting) {
        process.exit(0);
    } else {
        console.log('Got SIGINT. Landing, press Control-C again to force exit.');
        exiting = true;
        mission.control().disable();
        mission.client().land(function() {
            process.exit(0);
        });
    }
});

mission.land();

mission.client().ftrim();

setTimeout(runMission, 10);

function runMission() {
  console.log("Stopping...");
  // Execute mission
  mission.run(function (err, result) {
      if (err) {
          console.trace("Oops, something bad happened: %s", err.message);
          mission.client().stop();
          mission.client().land();
      } else {
          console.log("We are done!");
          process.exit(0);
      }
  });
}



