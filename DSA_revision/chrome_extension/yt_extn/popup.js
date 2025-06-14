
document.addEventListener("DOMContentLoaded", () => {
  const checkbox = document.getElementById("togglePause");

  chrome.storage.local.get(['globalPauseEnabled'], (data) => {
    checkbox.checked = data.globalPauseEnabled ?? false;
  });

  checkbox.addEventListener("change", () => {
    chrome.storage.local.set({ globalPauseEnabled: checkbox.checked });
  });
});
