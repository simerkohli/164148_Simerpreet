

db.zipcodes.aggregate(
[
{$match : { city : "ATLANTA" } },
{$group : { _id : null , total : { $sum : 1 }}}
]
);

db.zipcodes.aggregate(
[
{$match : { city : "ATLANTA" } },
{$group : { _id : "Total pop in Atlanta" , total : { $sum : "$pop" } } }
]
);

db.zipcodes.aggregate(
[
{ $group : { _id : "$state" , total : { $sum : "$pop" } } }
]
);

db.zipcodes.aggregate(
[
{ $group : { _id : "$state" , total : { $sum : "$pop" } } },
{ $sort : { total : -1 }},
{ $limit : 3}
]
);

db.zipcodes.aggregate(
[
{$group : { _id : {"city": "$city","state":"$state"} , total : { "$sum" : "$pop" } } },
{ $sort : { total : -1 } },
{ $limit : 3 }
]
);

---Bonus---

db.zipcodes.aggregate(
[
{$group : { _id : {"city": "$city","state":"$state"} , avgpop : { "$avg" : "$pop" } } }
]
);

db.zipcodes.aggregate(
[
{$group : { _id : {"city": "$city","state":"$state"} , avgpop : { "$avg" : "$pop" } } },
{$sort : { avgpop : -1 } },
{$limit : 3}
]
);
