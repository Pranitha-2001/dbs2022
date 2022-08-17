const fs = require('fs');
const dummy = (filename, text) => {
    return new Promise((resolve) => {
        const regEx = new RegExp(text, "i")
        const result = [];
        fs.readFile('file/' + filename + ".txt", 'utf8', function (err, contents) {
            console.log(err)
            let lines = contents.toString().split("\n");
            lines.forEach(line => {
                if (line && line.search(regEx) >= 0) {
                    console.log('found in file ', filename)
                    result.push(line)
                }
            })
            console.log('finished search');
            resolve(result);
        })
    });
}
export default dummy