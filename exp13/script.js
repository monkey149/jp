function validateEmail() {
  const email = document.getElementById("email").value.trim();
  if (!email.includes("@") || !email.includes(".")) {
    alert("Invalid email address, please include '@' and '.' characters.");
  } else {
    alert("Thank you for subscribing!");
  }
}
