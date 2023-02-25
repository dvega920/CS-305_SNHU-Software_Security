# CS-305_SNHU
CS-305 - Software Security 23EW3

## Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?

    My client Artemis Financial is a consulting company that provides financial planning services to their customer. The goal behind this project was to upgrade their existing software to reflect a more modern infrastructure. This upgrade included the modification of its software security. 

## What did you do very well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?

    What I did very well was to analyze the vulnerabilities that were identified by researching each CVE to determine if there was a solution. If a solution was provided via a software update or patch then I could supress the CVE so that it no longer appeared on my report. This would allow me to focus soleley on the open vulnerabilities. Another thing I thought I did well was to perform an analysis of the existing code base to see where I could implement security features such as validation, and error handling. 
    
    The importance of secure coding is so that non-public information remains private. Ideally, security should be implemnted at the start of the software development life cycle. The main benefit to this is to reduce business risks by catching potential security flaws early on rather than during testing. Implementing security throughout the SDLC also mitigates the need for additional overhead (Maayan, 2019).

## What part of the vulnerability assessment was challenging or helpful to you?

    I think the challenging part of the vulnerability assessment was how to interpret the CVEs. The analysis is rather complex and tedious if you have a lot of vulnerabilities to sift through. However, the OWASP dependency check was extremely useful in the project. It helped to guide my decisions regarding which security features needed to be implemented based on the scope of the vulnerabilities.


## How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

I was able to increase the layers of security by assessing the impact that a security breach could cause on the business for the type of industry. Because Artemis Financial services both domestic and international accounts, It made sense to implement a AES-128 encryption over AES-256. I think for extra peace of mind it might be worth it but AES-128 has never been cracked so it should suffice to meet the needs of Artemis Financial. The U.S. government is confident in AES-128 encryption for classified information so there is no reason why Artemis Financial should feel any less secure.


## How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

The best thing to do in any upgrade is to capture the pre and post implementation activities. Doing so will give you an apples to apples comparison of what changes were made and if they were effectively implemented. For Artemis Financial, I was able to run a pre-refactored vulnerability check to identify any vulnerabilites. After the code base was refactored, I re-ran the vulnerability check to ensure that no new vulnerabilities were introduced. Essentially, if done correctly, both vulnerability checks should be identical. 

In addition, I also checked to make sure that the site was secure by checking the site for ssl certificate. SSL certificates allows for the encryption of data transferred over the internet. Having a certificate validates that the data from a website is from a trusted source (Cloudfare, 2023). 


## What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?
The resources, tools and coding practices I used that helped me in this project was NIST.gov, OWASP Dependency check. I haven't had too much exposure to Java but as I progress through this degree program, I am introduced to new tools and resources that I didn't know existed. The NIST.gov website was a wealth of knowledge about vulnerabilities and the OWASP Dependency Check tool really helped to streamline the identification of these vulnerabilities. It may not provide all the vulnerabilities of the project but certainly enough to implement some useful security features.


## Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?

    I think it is good to show employers that you understand the tools and resources available to you and that you have an understanding of what they do and how you implemented them into your projects. I think I would be inclined to show them the pom.xml implementation of the maven dependency check. Also to show that I am current with new technologies such as spring boot. Most employers are looking for efficiency and what better way to prove your efficiency then by showing them the tools that help you do that. I would also point out the RESTful architecture that I implemented to show them that I understand the importance of a RESTful application and recognize security as an important part of the software development life cycle. I would suspect that there are some organizations that separate the responsibilities of security between IT and developers and having a developer who understand both security AND security during development would make me very marketable. 

---
# REFERENCES

Cloudflare, (2023). What is an SSL Certificate?. Cloudflare. 
    
    Retrieved February 25, 2023. 
    
    https://www.cloudflare.com/
    
    learning/ssl/what-is-an-ssl-certificate/  

Maayan, Gilad David (2019, July 12). *How You Should Approach the   
    
    Secure Development Lifecycle.* Dataversity. Retrieved 
    
    February 22, 2023. https://www.dataversity.net/
    
    how-you-should-approach-the-secure-development-
        
    lifecycle/#. 


