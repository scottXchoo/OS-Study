const express = require("express");

const app = express();

app.get("/", (req, res) => {
  res.send("Let's learn Docker!");
});

app.listen(8080, () => console.log("Server is running on port 8080"));
