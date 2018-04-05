# crypto_rep
### Crypto_Currency Application
This application uses CoinMarketCap API to display of the price (USD) and market cap (USD) of a given crypto-currency name.
* The source folder contains the source code of the application.
* The target folder contains the required files to run the application.
1. To build the docker image:
   - Use a terminal and make the target folder your current working directory.
   - Execute the following command to create a docker image called cryptoapp (don't forget to add the dot):
   ``` bash
   docker build -t cryptoapp .
   ```
2. To run the created image, execute the following command:
   ``` bash
   docker run --rm cryptoapp [crypto-currency name]
   ```
3. Examples of running the application
``` bash
   docker run --rm cryptoapp bitcoin .
```
``` bash
   docker run --rm cryptoapp ripple .
```
