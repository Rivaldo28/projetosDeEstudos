(() => {
  let i = 0;
  const num = 30;
  const followInterval = setInterval(() => {
    if (i >= num) {
      clearInterval(followInterval);
      return;
    }
    const buttons = document.querySelectorAll('button');
    const nextButton = buttons[i];
    nextButton.click();
    i++;
  }, 500);
})()

//explore/people/

var timeinc = 2000;

for (let i = 0; i < 2; i++) {
  setTimeout(() => {
    document.getElementsByClassName("_aacw")[0].click()
  }, timeinc)
  timeinc += 2000
  setTimeout(() => {
    document.getElementsByClassName("_aacw")[0].click()
  }, timeinc)
  timeinc += 2000
  setTimeout(() => {
    document.getElementsByClassName("_a9-- _a9-_")[0].click()
  }, timeinc),
    timeinc += 2000
}