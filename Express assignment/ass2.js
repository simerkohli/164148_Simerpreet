var express = require('express');
var app = express();

app.get('/:id', function(req, res){

var age=req.params.id;
var year= 2018-age;
   res.send('Your were born in  ' + year);
});
app.listen(3000);