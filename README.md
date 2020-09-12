# java-lambda-example
Java Lambda Example

### Create Bucket
Run `aws s3 mb s3://bd-lambda-deployments`

### Package the function
Run `aws cloudformation package --template-file template.yml --s3-bucket bd-lambda-deployments --output-template-file out.yml` .


### Deploy the function
Run `aws cloudformation deploy --template-file C:/BD/presentations/lambda/code/out.yml --stack-name java-lambda-example --capabilities CAPABILITY_NAMED_IAM`

### Running

## Built With

- [AWS-Lambda](https://eu-central-1.console.aws.amazon.com/lambda/home?region=eu-central-1#/functions) - AWS Lambda
- [Java](https://oracle.com/java/) - Java 11
- [Maven](https://maven.apache.org/) - Apache Maven Framework

## Authors

- **Bernard Adanlessossi** - _Initial work_

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

- **Thomas Wenger**, JUG Bern
- **Business & Decision**, Ittigen

## Further help