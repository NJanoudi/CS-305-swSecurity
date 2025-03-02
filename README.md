# CS-305-swSecurity

My client, Artemis Financial, is a consulting company that develops individualized financial plans for its customers, encompassing savings, retirement, investments, and insurance. They sought to modernize their operations and enhance the security of their public web interface to protect client data and financial information. Specifically, they wanted to add a file verification step using a checksum and ensure secure communication through HTTPS.   

In addressing their software security vulnerabilities, I successfully implemented SHA-256 checksum functionality for file verification and configured HTTPS using a self-signed certificate for secure communication. I also conducted a thorough manual code review to identify and address potential vulnerabilities, such as input validation checks to prevent injection attacks and secure storage practices for sensitive data. Secure coding is paramount to protect user data, maintain the company's reputation, prevent financial losses due to security breaches, and comply with relevant regulations and standards.   

The manual code review was particularly helpful in understanding the codebase and identifying potential vulnerabilities. It allowed me to gain a deeper understanding of the application's logic and security implications. To increase layers of security, I implemented checksums for data integrity, configured HTTPS for secure communication, and addressed vulnerabilities found during the code review. In the future, I would use a combination of automated vulnerability scanning tools, manual code review, and penetration testing to assess vulnerabilities and determine appropriate mitigation techniques.

To ensure the code and software application were functional and secure, I conducted thorough testing throughout the refactoring process. After each change, I tested the functionality to ensure it worked as expected and didn't introduce new vulnerabilities. I also used the dependency-check tool to perform a static security analysis of the code and identify any known vulnerabilities in the project's dependencies.

Several resources, tools, and coding practices proved valuable during this project. The Java Keytool was essential for generating self-signed certificates, while the dependency-check tool helped identify potential vulnerabilities in third-party libraries. Secure coding practices, such as input validation and secure password storage, were crucial for mitigating common security risks. These resources and practices will be beneficial in future assignments and tasks.

For future employers, I would showcase this project to demonstrate my ability to analyze and improve software security. I would highlight the successful implementation of checksum functionality, HTTPS configuration, and the thorough code review process. This project exemplifies my skills in secure coding practices, vulnerability assessment, and mitigation techniques, which are valuable assets in protecting sensitive data and ensuring the overall well-being of any organization.
