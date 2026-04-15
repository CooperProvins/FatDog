# FatDog
## Overview
### Function
- App will take user dog type and weight input, then calculate percentile, generate dog insult and recommended portion
### User
- Owners of fat dogs
### Need
- The dog obesity epidemic is undeniable and resilient.
- This app provides realistic weight feedback to the dog parent, as dog obesity is a slow killer. They may not even know their dog qualifies.
### Questions
- How fat is my dog?
- Am I a bad owner?
## Design
### Frontend
### Backend
![Class Diagram](/classDiagram.png)
## Math
We fit the dog weight quartiles to a bell curve, so the equation relating to user interaction is $z=\frac{x-\mu}{\sigma}$.<br>
It is also important to know that you can convert a percentile (i.e. fatter than 70% of dogs) to a z score via a non analytic function.<br>
This is implemented via someone elses java class, see credits.<br>
Assume $\text{min}$ represents the 1st quartile dog weight, and $\text{max}$ represents the 3rd quartile dog weight.
We know $75% \implies z = 0.674$. We also know the mean $\mu = \frac{\text{max}-\text{min}}{2}$<br>
Therefore, plugging in the 75th percentile, $0.674=\frac{\text{max}-\frac{\text{max}+\text{min}}{2}}{\sigma} = \frac{\text{max}-\text{min}}{2\sigma}$.<br>
We can then solve for the standard distribution. $\sigma = \frac{\text{max}-\text{min}}{1.348}$.
From there for any x we can plug it into the bell curve equation, $f(x) = \frac{1}{\sigma\sqrt{2\pi}} e^{-\frac{1}{2}\left(\frac{x-\mu}{\sigma}\right)^2}$
## Credits
- [Dog weight quartiles by sex](https://www.akc.org/expert-advice/nutrition/breed-weight-chart/)
- [Z score from percentile](https://gist.github.com/moxprox/8583bd5bb432f063afc6#file-zscoreconverter-java)
