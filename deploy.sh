docker build -t payment-risk-service .
cd helm
helm delete payment-risk-service
sleep 10
helm install payment-risk-service payment-risk-service/
cd ..