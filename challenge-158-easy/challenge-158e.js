var i, _i;

for (i = _i = 1000; _i < 9999; i = ++_i) {
  if (i.toString().match(/^(?:([0-9])(?!.*\1))*$/) && (Math.pow(Math.floor(i / 100) + (i % 100), 2)) === i) {
    console.log(i);
  }
}
