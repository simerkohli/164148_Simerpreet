var express = require('express');
var app = express();
var list=['bat','ball','badminton'];
var price=['250','150','450'];

app.get('/', function(req, res){
   res.send(list);
});

app.get('/:id', function(req, res){
var id=req.params.id;
   res.send(list[id] + '   ' + price[id]);
});

app.put('/push/:name', function(req, res){
const name= req.params.name;
list.push(name);
   res.send(list);
});

app.get('/delete/:id', function(req, res){
var id=req.params.id;
list.splice(id);

   res.send(list);
});

app.get('/patch/:name/:id', function(req, res){
const name= req.params.name;   
var id=req.params.id;
   list[id]=name;
   res.send(list);
});

app.listen(3000);