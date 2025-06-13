chrome.windows.onFocusChanged.addListener(windowId => {
  chrome.tabs.query({ active: true, lastFocusedWindow: true }, tabs => {
    if (tabs.length === 0) return;
    const tab = tabs[0];
    if (tab.url.includes("youtube.com/watch")) {
      chrome.scripting.executeScript({
        target: { tabId: tab.id },
        func: () => {
          const video = document.querySelector("video");
          if (document.hasFocus()) {
            video?.play();
          } else {
            video?.pause();
          }
        }
      });
    }
  });
});
