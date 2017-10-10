<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width-device-width, initial-scale=1.0">
  <link rel="stylesheet" type="text/css" href="../css/bootstrap-flatly.css">
  <link rel="shortcut icon" href="../icons/favicon1.png" type="image/x-icon" sizes="144x144">
  <title>Spark Demonstration | Log In</title>
</head>

<body class="content">
  <div class="container page-header" role="heading">
    <h1>Spark Demo</h1>
    <hr>
    <div class="navigation" role="navigation">
      <ul class="nav nav-pills nav-justified">
        <li role="presentation" class="active"><a class="nav nav-item" href="index.ftl">Home</a></li>
        <li role="presentation"><a class="nav nav-item" href="#">About</a></li>
        <li role="presentation"><a class="nav nav-item" href="#">External Links</a></li>
      </ul>
    </div>
  </div>
  <div class="container">
    <form class="form-group" action="results.ftl" method="post">
      <div class="container">
        <h2>Here's a Quick Form Layout</h2>
        <div class="form-group">
          <label for="name">Name: </label>
          <input class="form-control" id="name" type="text" name="name">
        </div>
        <div class="form-group">
          <label for="email">Email: </label>
          <input class="form-control" id="email" type="email" name="email">
        </div>
        <input type="submit" class="btn btn-default" name="submit">
        <small>This button will submit to a results page and displays the username
          and the email typed in.</small>
      </div>
    </form>
    <footer class="page-footer">
      <ul>

      </ul>
      <small>Disclaimer: At this time non of the buttons work on this site.
      Demonstration purposes only</small>
    </footer>
  </div>
  <script src="../js/jquery-3.2.1.js" charset="utf-8">
    < /script <
    /body> <
    /html>
