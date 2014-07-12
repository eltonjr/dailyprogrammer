console.log i for i in [1000...9999] when i.toString().match(/^(?:([0-9])(?!.*\1))*$/) and (Math.pow Math.floor(i/100) + (i%100), 2) is i
